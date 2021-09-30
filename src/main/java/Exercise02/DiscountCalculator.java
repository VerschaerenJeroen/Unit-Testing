package Exercise02;

public class DiscountCalculator {
    private boolean happyHour;
    private boolean VIPCustomer;
    private boolean goldenVIPCustomer;

    public int calculatePrice(int price, int amount) {
        if (price ==0 || amount==0) {
            return 0;
        }
        if (goldenVIPCustomer){
            if (price == 1) {
                return (int) ((price * amount) * 0.8 - 4);
            } else if (amount < 20) {
                return (int) ((price * amount) * 0.8);
            } else if (amount < 50) {
                return (int) ((price * amount) * 0.8 - 1);
            } else {
                return (int) ((price * amount) * 0.5 + 117);
            }
        }
        else {
            if (VIPCustomer) {
                if (price == 1) {
                    return (int) ((price * amount) * 0.9 - 4);
                } else if (amount < 20) {
                    return (int) ((price * amount) * 0.9);
                } else if (amount < 50) {
                    return (int) ((price * amount) * 0.9 - 1);
                } else {
                    return (int) ((price * amount) * 0.9 - 31);
                }
            }
            else {
                if (happyHour) {
                    if (price == 1) {
                        return (price * amount - 8) / 2;
                    } else if (amount < 10) {
                        return (price * amount) / 2;
                    } else if (amount == 10) {
                        return (price * amount) / 2 - 1;
                    } else if (amount < 20) {
                        return ((price * amount) - 2) / 2;
                    } else if (amount < 50) {
                        return ((price * amount) - 12) / 2;
                    } else {
                        return ((price * amount) - 72) / 2;
                    }
                } else {
                    if (price == 1) {
                        return price * amount - 8;
                    } else if (amount < 10) {
                        return price * amount;
                    } else if (amount == 10) {
                        return (price * amount) - 1;
                    } else if (amount < 20) {
                        return (price * amount) - 2;
                    } else if (amount < 50) {
                        return (price * amount) - 12;
                    } else {
                        return (price * amount) - 72;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DiscountCalculator dc = new DiscountCalculator();
        int result = dc.calculatePrice(10,50);
        System.out.println(result);
    }

    public void setHappyHour(boolean happyHour) {
        this.happyHour = happyHour;
    }

    public boolean getHappyHour() {
        return happyHour;
    }

    public void setVIPCustomer(boolean vipCustomer) {
        this.VIPCustomer = vipCustomer;
    }

    public boolean getVIPCustomer() {
        return VIPCustomer;
    }

    public void setGoldenVIPCustomer(boolean goldenVIPCustomer) {
        this.goldenVIPCustomer = goldenVIPCustomer;
    }

    public boolean getGoldenVIPCustomer() {
        return goldenVIPCustomer;
    }
}