package com.CodeHelp.C9_Stack.Assignment;

import java.util.*;

/*
https://leetcode.com/problems/car-fleet/
 */
public class A9_CarFleet_LEETCODE {

    public static void main(String[] args) {

        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};

        System.out.println(carFleet(12,position,speed));

    }

    public static int carFleet(int target, int[] position, int[] speed) {

        List<CarFleet1> cars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            CarFleet1 car = new CarFleet1(position[i], speed[i]);
            cars.add(car);
        }

        Collections.sort(cars, CarFleet1.comp);

        Stack<Float> stack = new Stack<>();
        for (CarFleet1 car : cars) {

            float time = (target-car.pos)/ ((float)car.speed);
            while (!stack.isEmpty() && time >= stack.peek()) {
                stack.pop();
            }
            stack.push(time);

        }
        return stack.size();
    }
}

class CarFleet1{

    int pos;
    int speed;

    CarFleet1(int pos, int speed){
        this.pos = pos;
        this.speed = speed;
    }

    public static Comparator<CarFleet1> comp = Comparator.comparingInt(A -> A.pos);
}
