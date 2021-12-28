public class Train {
    private String trainStation;
    private  int time;

    public Train(String trainStation, int time) {
        this.trainStation = trainStation;
        this.time = time;
    }

    public Train(String trainStation) {
        this.trainStation = trainStation;
    }

    public Train(int time) {
        this.time = time;
    }
}
