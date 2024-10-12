package dev.omedia.section6.exc29;

public class PaintJob {
    public static int getBucketCount(double wallWidth,
                                     double wallHeight,
                                     double areaPerBucket) {
        return getBucketCount(wallWidth, wallHeight, areaPerBucket, 0);
    }

    public static int getBucketCount(double wallWidth,
                                     double wallHeight,
                                     double areaPerBucket,
                                     int extraBuckets) {
        if (wallWidth <= 0 || wallHeight <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = wallHeight * wallWidth;
        return (int) Math.ceil(wallArea / areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        return area <= 0 || areaPerBucket <= 0 ? -1 : (int) Math.ceil(area / areaPerBucket);
    }
}
