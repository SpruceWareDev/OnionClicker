package dev.spruce.game.util;

public class MathUtils {

    /**
     * Linearly interpolates between two values.
     *
     * @param start The starting value.
     * @param end   The ending value.
     * @param t     The interpolation factor, typically in the range [0, 1].
     * @return The interpolated value.
     */
    public static float lerp(float start, float end, float t) {
        return start + (end - start) * t;
    }

    /**
     * Checks if a point is within a rectangular area.
     *
     * @param x          The x-coordinate of the point.
     * @param y          The y-coordinate of the point.
     * @param areaX      The x-coordinate of the top-left corner of the area.
     * @param areaY      The y-coordinate of the top-left corner of the area.
     * @param areaWidth  The width of the area.
     * @param areaHeight The height of the area.
     * @return True if the point is within the area, false otherwise.
     */
    public static boolean isPointInArea(float x, float y, float areaX, float areaY, float areaWidth, float areaHeight) {
        return x >= areaX && x <= (areaX + areaWidth) && y >= areaY && y <= (areaY + areaHeight);
    }
}
