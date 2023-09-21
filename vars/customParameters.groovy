def call(Map config){
    properties([parameters([

    choice(name:'branch', choices:['main', 'develop'], description:'choose any branch'),
    booleanParam(name: 'testParam', defaultValue: 'true', description:'select true or false')

    ])])    

    return params
}
