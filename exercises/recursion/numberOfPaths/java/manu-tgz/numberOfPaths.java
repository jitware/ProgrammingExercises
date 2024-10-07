
class numberOfPaths {

    public static int total;
    public static int numberOfPaths(int x, int y){
        total = 0;
        numberOfPathsR(x,y,0,0);
        return total;
    }
    public static void numberOfPathsR(int x, int y, int x1, int y1){
        if(x1==x && y1==y){
            total++;
        }
        else if(x>=x1 && y>=y1){
            numberOfPathsR(x,y,x1+1,y1);
            numberOfPathsR(x,y,x1,y1+1);
        }
    }
}