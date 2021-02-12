Field Injection. 
# 1 @Inject MainViewModel mMainViewModel;
# 2 void injectFields(MainActivity mainActivity);
# 3 DaggerMainViewModelInjector.create().injectFields(this);
# field(Member) we can not make private access 
# use case  if in  framework we can't not create constrctor then we  use @ field as refrence 
# if constrctor injection are using then field and method injector perform automatically (DaggerMainViewModelInjector.create().injectFields(this);) this type will not required to use next...

