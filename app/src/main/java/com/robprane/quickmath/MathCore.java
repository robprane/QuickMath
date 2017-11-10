package com.robprane.quickmath;

import android.util.Log;

import java.util.ArrayList;
import org.apache.commons.lang3.math.NumberUtils;

class MathCore {

    static ArrayList<Double> calculate(ArrayList<Double> list) {
        if(errorsCheck(list)) {
            for (int i = 0; i < list.size(); i++) {
                Log.d("TAG", list.get(i).toString());
            }
            Log.d("TAG", Integer.toString(list.size()));
            Log.d("TAG", "--0--");
            while (list.size() > 1) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    if (list.get(i) == 111.111) {
                        ArrayList<Double> part = new ArrayList<Double>();
                        for (int j = i + 1; j < list.size(); j++) {
                            if (list.get(j) == 222.222) {
                                for (int k = i; k <= j; k++) {
                                    list.remove(i);
                                }
                                list.add(i, binaryOperations(part));
                            } else {
                                part.add(list.get(j));
                            }
                        }
                    }
                }
                list.add(binaryOperations(list));
                for (int i = 0; i < list.size() - 1; i++) list.remove(i);
            }
            return list;
        } else {
            return list;
        }
    }

    private static Double binaryOperations(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            Log.d("TAG", list.get(i).toString());
        }
        Log.d("TAG", Integer.toString(list.size()));
        Log.d("TAG", "--1--");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 333.333) {
                double d = Math.pow(list.get(i - 1), list.get(i + 1));
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                i--;
                list.add(i, d);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Log.d("TAG", list.get(i).toString());
        }
        Log.d("TAG", Integer.toString(list.size()));
        Log.d("TAG", "--2--");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 444.444) {
                double d = list.get(i - 1) * list.get(i + 1);
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                i--;
                list.add(i, d);
            }
            if (list.get(i) == 555.555) {
                double d = list.get(i - 1) / list.get(i + 1);
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                i--;
                list.add(i, d);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Log.d("TAG", list.get(i).toString());
        }
        Log.d("TAG", Integer.toString(list.size()));
        Log.d("TAG", "--3--");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666.666) {
                double d = list.get(i - 1) + list.get(i + 1);
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                i--;
                list.add(i, d);
            }
            if (list.get(i) == 777.777) {
                double d = list.get(i - 1) - list.get(i + 1);
                list.remove(i + 1);
                list.remove(i);
                list.remove(i - 1);
                i--;
                list.add(i, d);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Log.d("TAG", list.get(i).toString());
        }
        Log.d("TAG", Integer.toString(list.size()));
        Log.d("TAG", "--4--");
        if (list.size() > 1) return binaryOperations(list);
        else return list.get(0);
    }

    private static boolean errorsCheck(ArrayList<Double> list) {
        boolean bracketsStart = false;
        int brackets = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 111.111) {
                brackets++;
                bracketsStart = true;
            }
            if (list.get(i) == 222.222 && bracketsStart) {
                brackets--;
            }
        }
        return brackets == 0;
    }

}
