package OOPS.Inhertiance;

class Box{
    double l;
    double h;
    double w;

    Box(double l, double h, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }
    
    Box(){
        this.w = -1;
        this.l = -1;
        this.h = -1;
    }

    Box(double side){
        this.h = side;
        this.w = side; 
        this.l = side;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void boxInfo(){
        System.out.println("Box is running");
    }

}
