def call(){
    parameters{

        choice(name:'branch', choices:'main\ndevelop', description:'choose any branch')
        booleanParam(name: 'testParam', defaultValue: 'true', description:'select true or false')
    }
}