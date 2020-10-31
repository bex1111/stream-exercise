package com.github.streamexercise.solution;

import com.github.streamexercise.StreamExercise;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExerciseImpl implements StreamExercise {


    @Override
    public List<?> collect1(Stream<String> stream) {
        return stream.collect(Collectors.toList());
    }

    @Override
    public Set<?> collect2(Stream<String> stream) {
        return stream.collect(Collectors.toSet());
    }
}
