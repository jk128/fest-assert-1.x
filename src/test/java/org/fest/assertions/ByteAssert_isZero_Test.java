/*
 * Created on Jun 18, 2007
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2007-2013 the original author or authors.
 */
package org.fest.assertions;

import org.junit.BeforeClass;

/**
 * Tests for {@link ByteAssert#isZero()}.
 *
 * @author Yvonne Wang
 * @author David DIDIER
 * @author Alex Ruiz
 */
public class ByteAssert_isZero_Test extends NumberAssert_isZero_TestCase<Byte> {
  private static Byte notZero;
  private static Byte zero;

  @BeforeClass
  public static void setUpOnce() {
    notZero = 6;
    zero = 0;
  }

  @Override
  protected Byte notZero() {
    return notZero;
  }

  @Override
  protected Byte zero() {
    return zero;
  }

  @Override
  protected ByteAssert assertionsFor(Byte actual) {
    return new ByteAssert(actual);
  }
}
