// Last updated: 8/11/2026, 2:18:08 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lossCount = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            lossCount.putIfAbsent(winner, 0);
            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
            int player = entry.getKey();
            int losses = entry.getValue();

            if (losses == 0) {
                noLoss.add(player);
            } else if (losses == 1) {
                oneLoss.add(player);
            }
        }

        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(noLoss);
        ans.add(oneLoss);
        return ans;
    
    }
}