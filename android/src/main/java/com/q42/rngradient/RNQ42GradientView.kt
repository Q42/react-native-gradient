package com.q42.rngradient;

import android.view.View
import android.content.Context

import android.graphics.Canvas
import android.graphics.PointF
import android.graphics.drawable.GradientDrawable

class RNQ42GradientView(context: Context) :  View(context) {
    private var _type: GradientType? = null
    private var _colors: IntArray? = null
    private var _radialRadius: Float? = null
    private var _radialCenter: PointF? = null

    fun setType(value: GradientType) {
        this._type = value
    }

    fun setColors(value: IntArray) {
        this._colors = value
    }

    fun setRadialRadius(value: Float) {
        this._radialRadius = value
    }

    fun setRadialCenter(value: PointF) {
        this._radialCenter = value
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val type = this._type?.let { it } ?: return
        val colors = this._colors?.let { it } ?: return

        val orientation = GradientDrawable.Orientation.TOP_BOTTOM
        val gradientDrawable = GradientDrawable(orientation, colors)

            GradientType.LINEAR -> this.applyLinearProperties(gradientDrawable)
            GradientType.RADIAL -> this.applyRadialProperties(gradientDrawable)
        when(type) {
        }

        this.setBackground(gradientDrawable)
    }

    private fun applyLinearProperties(gradientDrawable: GradientDrawable) {
        gradientDrawable.setGradientType(GradientDrawable.LINEAR_GRADIENT)
    }

    private fun applyRadialProperties(gradientDrawable: GradientDrawable) {
        val r = this._radialRadius?.let { it } ?: return
        val c = this._radialCenter?.let { it } ?: return

        gradientDrawable.setGradientType(GradientDrawable.RADIAL_GRADIENT)
        gradientDrawable.setGradientRadius(r)
        gradientDrawable.setGradientCenter(c.x, c.y)
    }
}