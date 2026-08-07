class Solution {
    class State{
        int row; int col;
        State(int row,int col)
        {
            this.row=row;
            this.col=col;
        }
    }
    int n,m ;

    public int numIslands(char[][] grid) {

        this.n=grid.length;
        this.m=grid[0].length;

        boolean vis[][]=new boolean[n][m];
        int islands=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    bfs(grid,vis,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }

    void bfs(char grid[][],boolean vis[][],int startrow,int startcol)
    {
        int level=0;
        int dr[]={0,0,-1,1};
        int dc[]={-1,1,0,0};

        Queue<State> q=new LinkedList<>();
        q.offer(new State(startrow,startcol));
        vis[startrow][startcol]=true;

        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                State curr=q.poll();
                int r=curr.row;
                int c=curr.col;

                for(int k=0;k<4;k++)
                {
                    int nr=r+dr[k];
                    int nc=c+dc[k];

                    if(nr<0 || nr >= n || nc >=m || nc < 0) continue;
                    if(vis[nr][nc]) continue;
                    if(grid[nr][nc] == '0') continue;
                    vis[nr][nc]=true;
                    q.offer(new State(nr,nc));

                }
            }
            level++;
        }
    }
}