给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26 种
不同种类的任务。任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在
任何一个单位时间内都可以执行一个任务，或者在待命状态。然而，两个相同种类的任务之间必须有
长度为 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。

你需要计算完成所有任务所需要的最短时间。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/task-scheduler
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] res=new int[26];
        for(char c:tasks){
            res[c-'A']++;
        }
        Arrays.sort(res);
        int maxcount=1;
        for(int i=24;i>=0;i--){
            if(res[i]!=res[25]){
                break;
            }
            maxcount++;
        }
        return (res[25]-1)*(n+1)+maxcount>tasks.length?(res[25]-1)*(n+1)+maxcount:tasks.length;
    }
}

