/*
 * ProgressViews
 * Copyright (c) 2015  Natasa Misic
 *
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.mddev.arcprogressbar.utils;

import android.content.Context;

import com.mddev.arcprogressbar.ArcProgressBar;
public class ProgressViewFactory {
	private Context context;

	public ProgressViewFactory(Context context) {
		this.context = context;
	}

	public ProgressShape getShape(ShapeType shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equals(ShapeType.ARC)) {
			return new ArcProgressBar(context);
		}
//		} else if (shapeType.equals(ShapeType.CIRCLE)) {
//			return new CircleProgressBar(context);
//
//		} else if (shapeType.equals(ShapeType.SEGMENT_CIRCLE)) {
//			return new CircleSegmentBar(context);
//
//		} else if (shapeType.equals(ShapeType.SEGMENT_CIRCLE)) {
//			return new LineProgressBar(context);
//		}

			return null;
		}
	}