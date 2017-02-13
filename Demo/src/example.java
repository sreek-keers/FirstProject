/*
 * Copyright (C) Ausy Technologies India - All Rights Reserved Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */

public class example {
    String name ;
    
    @Override
    public boolean equals(Object obj) {
        example e = (example) obj;
        return e.name.equals(this.name);
    }
}
class Atest {
    public static void main(String[] args) {
        example a = new example();
        a.name = "Hello";
        example b = new example();
        b.name = "Hello";
        
        System.out.println("equals:"+ new Boolean(a == b).toString());
    }
}
