public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {

    private boolean isOn = false;
    private int channelNumber = 1;
    private int volumeLevel = 1;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        if (isOn() && channelNumber >= 1 && channelNumber <= 99) {
            this.channelNumber = channelNumber;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (isOn() && volumeLevel >= 1 && volumeLevel <= 10) {
            this.volumeLevel = volumeLevel;
        }
    }

    public TV() {}

    @Override
    public void on() {
        setOn(true);
        setChannel(1);
        setVolumeLevel(1);
    }

    @Override
    public void off() {
        setOn(false);
    }

    @Override
    public void channelUp() {
        if (getChannelNumber() < 99) {
            setChannelNumber(getChannelNumber() + 1);
        } else {
            setChannelNumber(1);
        }
    }

    @Override
    public void channelDown() {
        if (getChannelNumber() > 1) {
            setChannelNumber(getChannelNumber() - 1);
        } else {
            setChannelNumber(99);
        }
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 99) {
            setChannelNumber(channel);
        }
    }

    @Override
    public void volumeUp() {
        if (getVolumeLevel() < 10) {
            setVolumeLevel(getVolumeLevel() + 1);
        }
    }

    @Override
    public void volumeDown() {
        if (getVolumeLevel() > 1) {
            setVolumeLevel(getVolumeLevel() - 1);
        }
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "TV is on, channel " + getChannelNumber() + ", volume " + getVolumeLevel();
        } else {
            return "TV is off";
        }
    }

    public void printStatus() {
        System.out.println(toString());
    }
}
