package com.company;

public class Microwave {
    int temp, time;
    Plate plate;
    Food food;

    Microwave(Plate plate, Food food) {
        this.plate = plate;
        this.food = food;
    }

    Food getFood() {
        return food;
    }

    void Start(int temp, int time) {
        if (25 <= temp && temp < 50 && 1 <= time && time <= 5) {
            food.statment = Statment.Warm;
        }
        else if (25 <= temp && temp < 50 && 5 < time) {
            food.statment = Statment.Warm;
            plate.statment = Statment.Warm;
        }
        else if (50 <= temp && temp < 75 && 1 <= time && time <= 2) {
            food.statment = Statment.Hot;
            plate.statment = Statment.Warm;
        }
        else if (50 <= temp && temp < 75 && 2 < time && time < 5) {
            food.statment = Statment.Hot;
            plate.statment = Statment.Hot;
        }
        else if (50 <= temp && temp < 75 && 5 < time) {
            food.statment = Statment.Dead;
            plate.statment = Statment.Hot;
        }
        else if (temp <= 75 && 1 < time) {
            food.statment = Statment.Dead;
            plate.statment = Statment.Dead;
        }
        else {
            System.out.println("Неверное время/температура");
        }
    }
}
