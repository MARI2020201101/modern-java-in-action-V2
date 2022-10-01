package flow;

import java.util.concurrent.Flow;

public class TempSubscriber implements Flow.Subscriber<TempInfo> {
    private Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(TempInfo item) {
        System.out.println("현재 " + item.getTown() + " 의 온도 : " + item.getTemp());
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("에러 발생!!");
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("구독 종료");
    }
}
