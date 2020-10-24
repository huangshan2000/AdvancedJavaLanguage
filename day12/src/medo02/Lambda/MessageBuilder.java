package medo02.Lambda;

@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接信息的 抽象方法，返回被拼接的信息
    public abstract String builderMessage();
}
