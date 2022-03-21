package com.company;


public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone(100, "Huawei", "111-111-111");
        Phone phone2 = new Phone(200, "Samsung", "222-222-222");
        Phone phone3 = new Phone(300, "Iphone", "333-333-333");

        Phone [] phones = {phone1,phone2, phone3};

        for (Phone ph : phones) {
            ph.getInfo();
            ph.receiveCall("Andrei");
            ph.receiveCall("Goblin", "123-123-123");
        }

        phone1.sendMessage("123-123-123");
        phone2.sendMessage("123-321-213", "321-321-213");
        phone3.sendMessage("333-331-332", "332-331-333", "331-333-332");

    }
}
