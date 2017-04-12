package org.gmelo.intestigation.util;

import org.gmelo.investigation.model.SampleModel;
import org.gmelo.intestigation.util.RandomUtils.*;

import java.time.LocalDateTime;

import static org.gmelo.intestigation.util.RandomUtils.generateDouble;
import static org.gmelo.intestigation.util.RandomUtils.generateRandomString;

/**
 * Created by gmelo on 12/04/17.
 */
public class GenerateRandomSampleModel {

    public static SampleModel generateRandomSampleModel() {

        return SampleModel.builder()
                .withId(generateRandomString("ID", 5))
                .withField1(generateRandomString("Field1", 5))
                .withField2(generateRandomString("Field2", 5))
                .withField3(generateRandomString("Field3", 5))
                .withTimestamp(LocalDateTime.now())
                .withValue(generateDouble(100))
                .withAnotherValue(generateDouble(75))
                .build();
    }
}
