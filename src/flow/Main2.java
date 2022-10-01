package flow;

import java.util.concurrent.Flow;

class Main2 {

    public static void main(String[] args) {
        celsiusProcessor("서울").subscribe(new TempSubscriber());
    }
    static Flow.Publisher<TempInfo> celsiusProcessor(String town){
        return subscriber -> {
            TempProcessor processor = new TempProcessor();
            processor.subscribe(subscriber);
            processor.onSubscribe(new TempSubscription(processor, town));
        };
    }
}
