package com.company;

public class QuestionList {
        private final QuestionShort overtaking = new QuestionShort("Что означает термин «Обгон»? \n" +
                "1. Выезд на встречную полосу.\n2. Выезд из занимаемой полосы.\n" +
                "3. Любое опережение одного или нескольких транспортных средств.","1");
        private final QuestionShort trafficLights = new QuestionShort("Разрешается ли избегать экстренное торможение?\n" +
                "1. Разрешается. \n2. Разрешается, только в прямом направлении. \n3. Запрещается.","1");
        private final QuestionShort railway = new QuestionShort("Какие ограничения по обгону, действуют на железнодорожных переездах? \n" +
                "1. Запрещен только на переезде. \n2. Запрещен на нем и за 100 м перед ним.\n" +
                "3. Запрещен на нем и за 100 м до и после него.","2");

        public QuestionShort getQuestion1 () {return overtaking;}
        public QuestionShort getQuestion2 () {return trafficLights;}
        public QuestionShort getQuestion3 () {return railway;}
}