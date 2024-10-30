import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setOutlineStationNumMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(10);
        int expected = 0;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setOutlineStationNumMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////////
    @Test
    void setNextStationNum() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setNextStationNumOutline() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStationNumOutline() {
        Radio radio = new Radio();
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setPrevStationNum() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStationNum();

        Assertions.assertEquals(expected, actual);
    }
    //////////////////////////////////////////////////

    @Test
    void increaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseSoundVolumeTestOutline() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolumeTestOutline() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
