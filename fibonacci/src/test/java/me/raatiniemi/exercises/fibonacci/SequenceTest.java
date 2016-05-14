/*
 * Copyright (C) 2016 Tobias Raatiniemi
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.raatiniemi.exercises.fibonacci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SequenceTest {
    @Test
    public void calculateValue() {
        int[] expectedValues = new int[]{
                1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,
                1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025,
                121393, 196418, 317811, 514229, 832040, 1346269, 2178309,
                3524578, 5702887, 9227465, 14930352, 24157817
        };

        Sequence sequence = Sequence.build(0, 1);
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, sequence.calculateValue());

            sequence = sequence.calculateNextSequence();
        }
    }
}
