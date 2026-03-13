#include <vector>
using namespace std;

class Solution {
public:
    vector<long long> mergeAdjacent(vector<int>& nums) {
        vector<long long> stack;

        for (int num : nums) {
            long long val = num;

            while (!stack.empty() && stack.back() == val) {
                val += stack.back();
                stack.pop_back();
            }

            stack.push_back(val);
        }

        return stack;
    }
};