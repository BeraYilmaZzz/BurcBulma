import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int ay, gün;
        boolean isError = false;
        String burç = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Yılın kaçıncı ayında doğdunuz ? : ");
        ay = inp.nextInt();
        System.out.print("Ayın kaçıncı günü doğdunuz ? : ");
        gün = inp.nextInt();
        if (ay < 13 && ay > 0) {
            if (ay == 1) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 21) {
                        burç = "OĞLAK";
                    } else {
                        burç = "KOVA";
                    }
                }else {
                    isError = false;
                }
            }else if (ay == 2) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 19) {
                        burç = "KOVA";
                    } else {
                        burç = "BALIK";
                    }
                } else {
                    isError = false;
                }
            }else if (ay == 3) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 20) {
                        burç = "BALIK";
                    } else {
                        burç = "KOÇ";
                    }
                } else {
                    isError = false;
                }
            }else if (ay == 4) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 20) {
                        burç = "KOÇ";
                    } else {
                        burç = "BOĞA ";
                    }
                } else {
                    isError = false;
                }
            }else if (ay == 5) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 21) {
                        burç = "BOĞA";
                    }else {
                        burç = "İKİZLER ";
                    }
                }else {
                    isError = false;
                }
            }else if (ay == 6) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 22) {
                        burç = "İKİZLER";
                    }else {
                        burç = "YENGEÇ";
                    }
                } else {
                    isError = false;
                }
            }else if (ay == 7) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 22) {
                        burç = "YENGEÇ";
                    }else {
                        burç = "ASLAN ";
                    }
                } else {
                    isError = false;
                }
            }else if (ay == 8) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 22) {
                        burç = "ASLAN";
                    }else {
                        burç = "BAŞAK ";
                    }
                }else {
                    isError = false;
                }
            }else if (ay == 9) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 22) {
                        burç = "BAŞAK";
                    }else {
                        burç = "TERAZİ";
                    }
                }else {
                    isError = false;
                }
            }else if (ay == 10) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 22) {
                        burç = "TERAZİ";
                    } else {
                        burç = "AKREP";
                    }
                }else {
                    isError = false;
                }
            }else if (ay == 11) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 21) {
                        burç = "AKREP";
                    }else {
                        burç = "YAY";
                    }
                }else {
                    isError = false;
                }
            } else if (ay == 12) {
                if (gün >= 1 && gün <= 31) {
                    if (gün <= 21) {
                        burç = "YAY";
                    }else {
                        burç = "OĞLAK";
                    }
                }else {
                    isError = false;
                }
            }
        } else {
            isError = true;
        } if (isError) {
            System.out.println("HATALI GİRİŞ");
        } else {
            System.out.println(burç);
        }
    }
}





