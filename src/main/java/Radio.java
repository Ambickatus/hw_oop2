public class Radio {
    private int currentStationNum;
    private int soundVolume;

    public void next() {
        if (currentStationNum < 9)
            currentStationNum += 1;
        else
            currentStationNum = 0;
    }

    public void prev() {
        if (currentStationNum > 0)
            currentStationNum -= 1;
        else
            currentStationNum = 9;
    }

    public void setCurrentStationNum(int newCurrentStationNum) {
        if (newCurrentStationNum <= 9 && newCurrentStationNum >= 0)
            currentStationNum = newCurrentStationNum;
        else
            return;
    }

    public void increaseVolume() {
        if (soundVolume < 100)
            soundVolume += 1;
        else
            return;
    }

    public void decreaseVolume() {
        if (soundVolume > 0)
            soundVolume -= 1;
        else
            return;
    }

    public int getCurrentStationNum() {
        return currentStationNum;
    }

    public int getCurrentSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }
}
