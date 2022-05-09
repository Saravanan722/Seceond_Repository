public class DoorSettings {
    public static void main(String[] arg) {
        Person1DoorSettingsCheck();
        Person2DoorSettingsCheck();
    }

    static void Person1DoorSettingsCheck()
    {
        //Person 1
        DoorSetting doorSetting = DoorSetting.getInstance();
        System.out.println(doorSetting.getIsDoorOpened());

        doorSetting.setIsDoorOpened(true);
        System.out.println(doorSetting.getIsDoorOpened());
    }

    static void Person2DoorSettingsCheck()
    {
        //Person 2
        DoorSetting doorSetting = DoorSetting.getInstance();
        System.out.println(doorSetting.getIsDoorOpened());

        doorSetting.setIsDoorOpened(false);
        System.out.println(doorSetting.getIsDoorOpened());
    }
}


class DoorSetting {

    private static DoorSetting privateInstance = null;

    private boolean isDoorOpened;

    private DoorSetting() { }

    static DoorSetting getInstance() {
        if(privateInstance == null) {
            System.out.println("Called");
            privateInstance = new DoorSetting();
        }

        System.out.println("Instance returned");
        return privateInstance;
    }

    boolean getIsDoorOpened() {
        return isDoorOpened;
    }

    void setIsDoorOpened(boolean isOpen) {
        isDoorOpened = isOpen;
    }
}


