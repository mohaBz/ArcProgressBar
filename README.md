# ArcProgressBar
Arc shape ProgressBar with possibility to put dashes 
this project is besed on the work of [natasam](https://github.com/natasam/DemoProgressViewsLibApp) if you are looking for more shapes check out his work it contains more shapes
# Features 
make arc shaped progressbar
make dash arc shape progress bar
progress gradient coloring
# ScreenShots 
 ![Alt text](screenshots/arcprogscshot.PNG?raw=true) ![Alt text](screenshots/Screenshot_1586467916.png?raw=true) 
# Code Example 
you can customized the View through XML like this example
```
    <com.mddev.arcprogressbar.ArcProgressBar
        android:id="@+id/arc"
        android:layout_width="300dp"
        android:layout_height="250dp"
        app:bar_width="15dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.145"
        app:progress="50"
        app:progress_color="#d3f115"
        app:progress_width="15dp"
        app:dash_stroke="true"
        app:dash_lenght="40dp"
        app:dash_gap="20dp"
        ></com.mddev.arcprogressbar.ArcProgressBar>
        
```
set `dash_stroke` to activite the dash feature and use `dash_lenght` and `dash_gap` to modify the sizes
or use it programmatically by calling 
```
ArcProgressBar arcProgressBar=new ArcProgressBar(context);
        arcProgressBar.setProgress(progress);
        ArcProgressBar.setWidthProgressBackground(backWidth);
        ArcProgressBar.setWidthProgressBarLine(progressWidth);
        ArcProgressBar.setBackgroundColor(Color.BLUE);
        ArcProgressBar.setProgressColor(Color.RED);
```
to use gradiant colors 
```
arcProgressBar.setLinearGradientProgress(true,new int[]{getColor(R.color.yellow) ,getColor(R.color.red)});
```
# Library
- android support library
