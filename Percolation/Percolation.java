package algorithms.Percolation;



/*
 *
 * @author @danyjavierb
 * 0 locked
 * 1 open 
 * 2 full
 * 
 * The model. We model a percolation system using an N-by-N grid of sites.
 * Each site is either open or blocked. A full site is an open site that can
 * be connected to an open site in the top row via a chain of neighboring 
 * (left, right, up, down) open sites. We say the system percolates if there
 * is a full site in the bottom row. In other words, a system percolates if we
 * fill all open sites connected to the top row and that process fills some open 
 * site on the bottom row. (For the insulating/metallic materials example, 
 * the open sites correspond to metallic materials, so that a system that
 * percolates has a metallic path from top to bottom, with full sites conducting. 
 * 
 * For the porous substance example, the open sites correspond to empty space through
 * which water might flow, so that a system that percolates lets water fill open sites, 
 * flowing from top to bottom.)
 */

public class Percolation {

    private int[][] grid;
    private int count;
    private int[] id,sz;
    private int N;       
            
    public Percolation(int N) {

        grid = new int[N][N];
        this.N=N;
        for (int i = 0; i < N; i++) {
            for (int j = 0; i < N; j++) {
                grid[N][N] = 0;
            }
        }
        
        
    }

    //create Qu data structure
    
    
    private int xytox(int x, int y){
        return (this.N*x)+y;
    }
    
     private void WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    
    public void open(int i, int j) {

        this.grid[i][j] = 1;

    }

    public boolean isOpen(int i, int j) {

        if (this.grid[i][j] == 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull(int i, int j) {
        if (this.grid[i][j] == 2) {
            return true;
        } else {
            return false;
        }

    }

    public boolean percolates() {
        
        return true;
        
        
    }
    
    public static void main (String []a){
    
    
    }
    
}
