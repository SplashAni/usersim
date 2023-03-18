package com.github.ridglef.usersim.types;

public class IpAdress {
    public final int one;
    public final int two;
    public final int three;
    public final int four;
    public final String full;

    public IpAdress(int one, int two, int three, int four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.full = (this.one + "." + this.two + "." + this.three + "." + this.four);
    }
}
