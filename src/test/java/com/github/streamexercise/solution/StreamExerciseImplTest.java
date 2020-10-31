package com.github.streamexercise.solution;

import com.github.streamexercise.StreamExercise;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamExerciseImplTest {

    private StreamExercise streamExercise;

    @Before
    public void setUp() {
        this.streamExercise = new StreamExerciseImpl();
    }

    @Test
    public void collect1(){
        Assert.assertTrue(List.of("test1","test2").containsAll(streamExercise.collect1(Stream.of("test1","test2"))));
    }


    @Test
    public void collect2(){
        Assert.assertTrue(Set.of("test1","test2").containsAll(streamExercise.collect2(Stream.of("test1","test2"))));
    }


}