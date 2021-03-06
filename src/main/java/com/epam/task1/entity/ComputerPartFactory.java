package com.epam.task1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComputerPartFactory {

    private final static Random rnd = new Random();

    public List<ComputerPart> createParts(int count, ComputerPart.ComputerPartType... ComputerPartType) {

        List<ComputerPart> computerPartList = new ArrayList<ComputerPart>();
        ComputerPart computerPart;

        for (int i = 0; i < count; i++) {
            String nameInstrument = ComputerPartType[rnd.nextInt(ComputerPartType.length)].name();

            if (nameInstrument.equals("MONITOR")) {
                computerPart = monitorFactory();
                computerPartList.add(computerPart);

            } else if (nameInstrument.equals("DRIVE")) {
                computerPart = driveFactory();
                computerPartList.add(computerPart);

            } else if (nameInstrument.equals("CPU")) {
                computerPart = cpuFactory();
                computerPartList.add(computerPart);

            } else if (nameInstrument.equals("MOUSE")) {
                computerPart = mouseFactory();
                computerPartList.add(computerPart);

            } else if (nameInstrument.equals("VIDEOCARD")) {
                computerPart = videocardFactory();
                computerPartList.add(computerPart);

            } else if (nameInstrument.equals("KEYBOARD")) {
                computerPart = keyboardFactory();
                computerPartList.add(computerPart);
            }
        }
        return computerPartList;
    }

    private Monitor monitorFactory() {
        int id = 1;
        Monitor.ScreenSize screenSize = Monitor.ScreenSize.values()[rnd.nextInt(Monitor.ScreenSize.values().length)];
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(310));
        String brand = "BENQ";
        Periferia.PeriferiaCount periferiaCount = Periferia.PeriferiaCount.values()[rnd.nextInt(Periferia.PeriferiaCount.values().length)];

        Monitor monitor = new Monitor(id, country, price, brand, periferiaCount, screenSize);

        return monitor;

    }

    private Drive driveFactory() {
        int id = 2;
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(185));
        String maker = "Samsung";
        Component.Type type = Component.Type.values()[rnd.nextInt(Component.Type.values().length)];
        Drive.Input interfaces = Drive.Input.values()[rnd.nextInt(Drive.Input.values().length)];

        Drive drive = new Drive(id, country, price, maker, interfaces, type);

        return drive;

    }

    private CPU cpuFactory() {
        int id = 3;
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(510));
        String maker = "AMD FX8200";
        Component.Type type = Component.Type.values()[rnd.nextInt(Component.Type.values().length)];
        CPU.Type cpu = CPU.Type.values()[rnd.nextInt(CPU.Type.values().length)];
        int quantityCore = 8;
        double frequency = 4.2;
        int cacheMemory = 3;

        CPU CPU = new CPU(id, country, price, maker, quantityCore, frequency, cacheMemory, type);

        return CPU;
    }

    private Mouse mouseFactory() {
        int id = 4;
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(145));
        String maker = "HP";
        Periferia.PeriferiaCount octavesCount = Periferia.PeriferiaCount.values()[rnd.nextInt(Periferia.PeriferiaCount.values().length)];
        Mouse.TypeMouse typeMouse = Mouse.TypeMouse.values()[rnd.nextInt(Mouse.TypeMouse.values().length)];

        Mouse mouse = new Mouse(id, country, price, maker, octavesCount, typeMouse);

        return mouse;
    }

    private Videocard videocardFactory() {
        int id = 5;
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(400));
        String maker = "Radeon HD7990";
        Component.Type type = Component.Type.values()[rnd.nextInt(Component.Type.values().length)];
        Videocard.Input extensionBoard = Videocard.Input.values()[rnd.nextInt(Mouse.TypeMouse.values().length)];
        double dataBus = 256;
        double versionShader = 5.0;
        int videoMemory = 2;

        Videocard videocard = new Videocard(id, country, price, maker, extensionBoard, (int) dataBus, versionShader, videoMemory, type);

        return videocard;
    }

    private Keyboard keyboardFactory() {
        int id = 6;
        ComputerPart.Country country = ComputerPart.Country.values()[rnd.nextInt(ComputerPart.Country.values().length)];
        BigDecimal price = BigDecimal.valueOf(rnd.nextInt(15));
        String maker = "Hi tech";
        Periferia.PeriferiaCount periferiaCountt = Periferia.PeriferiaCount.values()[rnd.nextInt(Periferia.PeriferiaCount.values().length)];
        Keyboard.TypeKeybord typeKeyboards = Keyboard.TypeKeybord.values()[rnd.nextInt(Keyboard.TypeKeybord.values().length)];

        Keyboard keyboard = new Keyboard(id, country, price, maker, periferiaCountt, typeKeyboards);

        return keyboard;
    }
}