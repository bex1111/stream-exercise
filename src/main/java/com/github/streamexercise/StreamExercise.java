package com.github.streamexercise;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public interface StreamExercise {
    List<?> collect1(Stream<String> stream);

    Set<?> collect2(Stream<String> stream);
}
