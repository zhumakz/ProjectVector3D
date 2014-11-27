package testing;


import vectors.Vector3D;


public class TestVector3D {
    
    public static void main(String[] args) {
        Vector3D vectorU=new Vector3D();
        Vector3D vectorV=new Vector3D(3, 5, 8);
        Vector3D vectorW=new Vector3D(vectorV);
        
        System.out.println("vectorU="+vectorU);
        System.out.println("vectorV="+vectorV);
        System.out.println("vectorW="+vectorW);
        
        System.out.println("Długość vectorU="+vectorU.length());
        System.out.println("Długość vectorV="+vectorV.length());
        System.out.println("Długość vectorW="+vectorW.length());
        
        Vector3D vectorSum=vectorV.add(vectorW);
        System.out.println("vectorSum="+vectorSum);
        
        Vector3D vectorMultiplied=vectorV.multiplyByScalar(2.5);
        System.out.println("vectorMultiplied="+vectorMultiplied);
        
        double prod=vectorV.dotProduct(vectorW);
        System.out.println("dotProduct="+prod);
        
        Vector3D vectorCrossProd=vectorV.crossProduct(vectorW);
        System.out.println("vectorCrossProd="+vectorCrossProd);
    }//public static void main
    
}//public class TestVector3D
