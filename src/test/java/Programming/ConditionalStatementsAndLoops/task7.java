package Programming.ConditionalStatementsAndLoops;

import org.junit.Test;

import javax.print.attribute.standard.Finishings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Random;

public class task7 {
    /**
     * За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много". Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу. Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        Random random = new Random();

        int secret;
        secret = random.nextInt(20 + 1);

        int case1 = Integer.parseInt(reader.readLine());

        if (case1 == secret) {
            System.out.println("Угадал :)");
        } else if (case1 < secret) {
            System.out.println("Мало");

            int case2 = Integer.parseInt(reader.readLine());
            if (case2 == secret) {
                System.out.println("Угадал :)");
            } else if (case2 < secret) {
                System.out.println("Мало");

                int case3 = Integer.parseInt(reader.readLine());
                if (case3 == secret){
                    System.out.println("Угадал :)");
                } else if (case3 < secret) {
                    System.out.println("Мало");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                } else if (case3 > secret) {
                    System.out.println("Много");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                }
            } else if (case2 > secret) {
                System.out.println("Много");

                int case3 = Integer.parseInt(reader.readLine());
                if (case3 == secret){
                    System.out.println("Угадал :)");
                } else if (case3 < secret) {
                    System.out.println("Мало");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                } else if (case3 > secret) {
                    System.out.println("Много");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                }
            }
        } else if (case1 > secret) {
            System.out.println("Много");

            int case2 = Integer.parseInt(reader.readLine());
            if (case2 == secret) {
                System.out.println("Угадал :)");
            } else if (case2 < secret) {
                System.out.println("Мало");

                int case3 = Integer.parseInt(reader.readLine());
                if (case3 == secret){
                    System.out.println("Угадал :)");
                } else if (case3 < secret) {
                    System.out.println("Мало");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case6 = Integer.parseInt(reader.readLine());
                        if (case6 == secret){
                            System.out.println("Угадал :)");
                        } else if (case6 < secret) {
                            System.out.println("Мало");

                            int case7 = Integer.parseInt(reader.readLine());

                            if (case7 == secret){
                                System.out.println("Угадал :)");
                            } else {
                                System.out.println("Не угадал :(");
                            }
                        } else if (case6 > secret) {
                            System.out.println("Много");

                            int case7 = Integer.parseInt(reader.readLine());

                            if (case7 == secret){
                                System.out.println("Угадал :)");
                            } else {
                                System.out.println("Не угадал :(");
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                } else if (case3 > secret) {
                    System.out.println("Много");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                }
            } else if (case2 > secret) {
                System.out.println("Много");

                int case3 = Integer.parseInt(reader.readLine());
                if (case3 == secret){
                    System.out.println("Угадал :)");
                } else if (case3 < secret) {
                    System.out.println("Мало");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                } else if (case3 > secret) {
                    System.out.println("Много");

                    int case4 = Integer.parseInt(reader.readLine());
                    if (case4 == secret){
                        System.out.println("Угадал :)");
                    } else if (case4 < secret) {
                        System.out.println("Мало");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    } else if (case4 > secret) {
                        System.out.println("Много");

                        int case5 = Integer.parseInt(reader.readLine());
                        if (case5 == secret){
                            System.out.println("Угадал :)");
                        } else if (case5 < secret) {
                            System.out.println("Мало");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        } else if (case5 > secret) {
                            System.out.println("Много");

                            int case6 = Integer.parseInt(reader.readLine());
                            if (case6 == secret){
                                System.out.println("Угадал :)");
                            } else if (case6 < secret) {
                                System.out.println("Мало");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            } else if (case6 > secret) {
                                System.out.println("Много");

                                int case7 = Integer.parseInt(reader.readLine());

                                if (case7 == secret){
                                    System.out.println("Угадал :)");
                                } else {
                                    System.out.println("Не угадал :(");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
