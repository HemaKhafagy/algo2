/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HEMA KHAFAGY
 */
public class add {
    public add(){

    }
 
//==============================================================
//function itersections to get numbers of itersections in array
//==============================================================
public int Intersections(int[] a)
{
    //===========================================
    //intialize variables
    //===========================================
    int intersec = 0;
    int[] dps = new int[a.length];
    int[] dpe = new int[a.length];
    //===========================================
    //for loop to get starts and ends points
    //===========================================
    for (int i = 0, t = a.length - 1; i < a.length; i++)
    {
        int o,p;
        if(i>a[i]){
            o=i-a[i];
        }else
            o=0;
        if(t-i>a[i]){
            p=i+a[i];
        }else
            p=t;
        
       // dps[o]++;
       dps[o]=dps[o]+1;
        //System.out.println(dpe[p]);
        dpe[p]++;
        //System.out.println(p);

    }

    int open = 0;
    //===========================================
    //for loop to get number of intersections
    //===========================================
    for (int i = 0; i < a.length; i++)
    {
        if (dps[i] > 0)
        {
            intersec += open * dps[i];
            intersec += dps[i] * (dps[i] - 1) / 2;
            open += dps[i];
        }
        open -= dpe[i];
        //System.out.println(result);
        //System.out.println(t);
       if (10000000 < intersec) return  -1;
    }
   System.out.println("the number of intersection: \n"+intersec);
   return intersec;
}
}
