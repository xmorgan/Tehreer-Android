/*
 * Copyright (C) 2017 Muhammad Tayyab Akram
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mta.tehreer.layout.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/**
 * The <code>TypeSizeSpan</code> class represents a span for specifying absolute type size.
 */
public class TypeSizeSpan extends MetricAffectingSpan {

    private final float size;

    /**
     * Constructs a type size span object.
     *
     * @param size The absolute type size in pixels.
     */
    public TypeSizeSpan(float size) {
        this.size = size;
    }

    /**
     * Returns this span's type size.
     *
     * @return The font type of this span.
     */
    public float getSize() {
        return size;
    }

    @Override
    public void updateMeasureState(TextPaint textPaint) {
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
    }
}
