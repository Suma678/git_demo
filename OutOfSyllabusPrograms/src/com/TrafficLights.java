package com;

	class TrafficLight {
	    private String currentLight = "RED";

	    public synchronized void changeLight() {
	        switch (currentLight) {
	            case "RED":
	                currentLight = "GREEN";
	                break;
	            case "GREEN":
	                currentLight = "YELLOW";
	                break;
	            case "YELLOW":
	                currentLight = "RED";
	                break;
	        }
	        notifyAll();  // Notify all waiting threads to recheck the condition
	    }

	    public synchronized void showLight(String light) {
	        while (!currentLight.equals(light)) {
	            try {
	                wait();  // Wait until the light changes to the expected state
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	                System.out.println(light + " light interrupted.");
	            }
	        }
	        System.out.println(light + " light is ON");
	        try {
	            Thread.sleep(2000);  // Simulate the light being on for 2 seconds
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.out.println(light + " light interrupted.");
	        }
	        changeLight();  // Change to the next light
	    }
	}

	class LightThread extends Thread {
	    private final TrafficLight trafficLight;
	    private final String light;

	    public LightThread(TrafficLight trafficLight, String light) {
	        this.trafficLight = trafficLight;
	        this.light = light;
	    }

	    @Override
	    public void run() {
	        while (true) {
	            trafficLight.showLight(light);
	        }
	    }
	}

	public class TrafficLights {
	    public static void main(String[] args) {
	        TrafficLight trafficLight = new TrafficLight();

	        // Create threads for each light
	        LightThread redLightThread = new LightThread(trafficLight, "RED");
	        LightThread greenLightThread = new LightThread(trafficLight, "GREEN");
	        LightThread yellowLightThread = new LightThread(trafficLight, "YELLOW");

	        // Start the threads
	        redLightThread.start();
	        greenLightThread.start();
	        yellowLightThread.start();
	    }
	}
