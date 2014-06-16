public class Palpite {
    Time time1,time2;
    Time timeVencedor;


    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public void setTimeVencedor(){
        if(time1.getGols()>time2.getGols()){
            timeVencedor = time1;
        }else if (time1.getGols()<time2.getGols()){
            timeVencedor = time2;
        }else {
            timeVencedor = null;
        }
    }

    public Time getTimeVencedor() {
        return timeVencedor;
    }

    public String toString(){
        return time1.toString() + " X " + time2.toString();
    }
}