package 자동차종합연습;

public abstract class Car {
    int maxSpeed;
    int fuelEff;
    int fuelTank;
    int seatCnt;
    int payL = 2000;
    String name;

    public Car() {
        this.maxSpeed = 200;
        this.fuelEff = 10;
        this.fuelTank = 30;
        this.seatCnt = 4;
    }

    int getDistance(int area) {
        if (area == 1) return 400;
        if (area == 2) return 150;
        if (area == 3) return 200;
        if (area == 4) return 300;
        else return 0;
    }

    int getMovingCnt(int passCnt) {
        if (passCnt / seatCnt != 0) return passCnt / seatCnt + 1;
        else return passCnt / seatCnt;
    }

    int getTotalCost(int distance, int moveCnt) {
        return distance / payL * fuelEff * moveCnt;
    }

    int getRefuelCnt(int distance, int moveCnt) {
        if (distance  * moveCnt % fuelEff * fuelTank != 0)
            return ((distance * moveCnt % fuelEff * fuelTank) + 1);
        else return distance * moveCnt % fuelEff * fuelTank;
    }

    int getMovingTime(int distance, int moveCnt) {
        return distance * moveCnt / maxSpeed;
    }

    abstract void setMode(boolean isMode);

}
