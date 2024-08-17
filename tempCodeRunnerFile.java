anel(new GridLayout(11, 9));
        for (int i = 0; i < 99; i++) {
            String symbol = (i % 9 == 0) ? specialSymbol : Character.toString((char) (33 + (i % 94)));
            symbolLabels[i] = new Label(i + ": " + symbol); // Numbering symbols
            symbolLabels[i].setAlignment(Label.CENTER);
            symbolPanel.add(symbolLabels[i]);
        }