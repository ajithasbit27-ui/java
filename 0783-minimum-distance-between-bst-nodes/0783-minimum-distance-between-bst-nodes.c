#include <limits.h>
#include <stdlib.h>

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

void inorder(struct TreeNode* root, struct TreeNode** prev, int* minDiff) {
    if (root == NULL) {
        return;
    }
    inorder(root->left, prev, minDiff);
    if (*prev != NULL) {
        int diff = root->val - (*prev)->val;
        if (diff < *minDiff) {
            *minDiff = diff;
        }
    }
    *prev = root;
    inorder(root->right, prev, minDiff);
}

int minDiffInBST(struct TreeNode* root) {
    int minDiff = INT_MAX;
    struct TreeNode* prev = NULL;
    inorder(root, &prev, &minDiff);
    return minDiff;
}

