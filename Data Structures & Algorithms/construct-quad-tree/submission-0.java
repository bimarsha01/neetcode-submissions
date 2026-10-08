/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        int length = grid.length;
        
       return traverse(grid , 0 , 0 , length);

    }
    
    public Node traverse( int[][]grid ,  int startRow , int startColumn , int length){

        Node node = new Node();

        if(length == 1 ){
           node.val = (grid[startRow][startColumn] == 1);
            node.isLeaf = true;
            return node;
        }
        int size = length/2;
        int count = 0;

        int first = grid[startRow][startColumn];
        for(int i = startRow ; i< startRow + length; i++){
            for(int j = startColumn; j < startColumn + length ; j++){
                if(grid[i][j] != grid[startRow][startColumn]){ 
                count = count + 1;
                }   
            }  
        }

        if(count > 0){

            node.topLeft = traverse(grid , startRow , startColumn , size);
            node.topRight = traverse(grid , startRow , startColumn+size , size);
            node.bottomLeft = traverse(grid , startRow + size , startColumn, size);
            node.bottomRight = traverse(grid , startRow + size , startColumn + size , size);

            return node;
        }
        else {
                   node.val = (grid[startRow][startColumn] == 1);
                    node.isLeaf = true;
                    return node;
        }
    }
}