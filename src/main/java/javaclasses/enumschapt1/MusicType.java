package javaclasses.enumschapt1;

public enum MusicType {
    ROCK("Rock"), JAZZ("Jazz"), CLASSIC;
    private String realName;

    private MusicType() { //только private или default
    }

    MusicType(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public void info() {
        switch (this) {
            case JAZZ:
                System.out.println("this is " + realName);
                break;
            case ROCK:
                System.out.println("this is " + realName);
                break;
            case CLASSIC:
                System.out.println("this is Classic");
                break;
            default:
                System.out.println("style out"); //а еще лучше - исключения
        }
    }
}
