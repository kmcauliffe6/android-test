/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.test.espresso.device.controller

import androidx.annotation.RestrictTo
import androidx.annotation.RestrictTo.Scope
import androidx.test.annotation.ExperimentalTestApi

/**
 * Enum for modes a foldable device can be set to.
 *
 * For more information on foldable device postures, see
 * https://developer.android.com/guide/topics/large-screens/learn-about-foldables
 */
@ExperimentalTestApi
enum class DeviceMode(private val mode: Int) {
  // the device screen is completely flat, like a tablet
  FLAT(0),
  // the device is folded with the hinge in a horizontal position
  TABLETOP(1),
  // the device is folded with the hinge in a vertical position
  BOOK(2),
  // the device screen is closed
  CLOSED(3);

  /**
   * Returns the mode.
   *
   * @hide
   */
  @RestrictTo(Scope.LIBRARY) fun getMode(): Int = mode
}
