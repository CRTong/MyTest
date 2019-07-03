class FirstProblem implements Calculate {
    @Override
    public void calculate1() {
        int count = 100;
        int money = 100;
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j <= count; j++) {
                for (int k = 0; k <= count; k++) {
                    if (i + j + k == count && (5 * i + 3 * j + k /3 == money) && k % 3
                            == 0) {
                        System.out.println("公鸡：" + i + ",母鸡：" + j + "小鸡:" + k);
                    }
                }
            }
        }

    }
}