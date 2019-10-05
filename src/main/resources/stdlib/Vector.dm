extern struct Vector<T> {
    extern const size: Int

    extern fun each(consume: Fn<Void>): Void
    extern fun map<S>(consumer: Fn<S>): Vector<T>
    extern fun filter<S>(consumer: Fn<S>): Vector<T>
    extern fun reduce<S>(consumer: Fn<S>): Vector<T>
    extern fun includes(consumer: T): Bool
    extern fun push(item: T): Vector<T>
    extern fun pop(): T
}
